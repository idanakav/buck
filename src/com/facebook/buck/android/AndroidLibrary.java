/*
 * Copyright 2012-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.android;

import static com.facebook.buck.rules.BuildableProperties.Kind.ANDROID;
import static com.facebook.buck.rules.BuildableProperties.Kind.LIBRARY;

import com.facebook.buck.jvm.java.CompileToJarStepFactory;
import com.facebook.buck.jvm.java.DefaultJavaLibrary;
import com.facebook.buck.jvm.java.DefaultJavaLibraryBuilder;
import com.facebook.buck.jvm.java.JavacOptions;
import com.facebook.buck.model.BuildTarget;
import com.facebook.buck.model.Either;
import com.facebook.buck.rules.AddToRuleKey;
import com.facebook.buck.rules.BuildRule;
import com.facebook.buck.rules.BuildRuleParams;
import com.facebook.buck.rules.BuildRuleResolver;
import com.facebook.buck.rules.BuildableProperties;
import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.SourcePathResolver;
import com.facebook.buck.rules.SourcePathRuleFinder;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

import java.nio.file.Path;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;

public class AndroidLibrary extends DefaultJavaLibrary implements AndroidPackageable {

  private static final BuildableProperties PROPERTIES = new BuildableProperties(ANDROID, LIBRARY);

  /**
   * Manifest to associate with this rule. Ultimately, this will be used with the upcoming manifest
   * generation logic.
   */
  @AddToRuleKey
  private final Optional<SourcePath> manifestFile;

  public static Builder builder(
      BuildRuleParams params,
      BuildRuleResolver buildRuleResolver,
      CompileToJarStepFactory compileStepFactory) {
    return new Builder(params, buildRuleResolver, compileStepFactory);
  }

  @VisibleForTesting
  AndroidLibrary(
      BuildRuleParams params,
      SourcePathResolver resolver,
      SourcePathRuleFinder ruleFinder,
      Set<? extends SourcePath> srcs,
      Set<? extends SourcePath> resources,
      Optional<SourcePath> proguardConfig,
      ImmutableList<String> postprocessClassesCommands,
      ImmutableSortedSet<BuildRule> exportedDeps,
      ImmutableSortedSet<BuildRule> providedDeps,
      ImmutableSortedSet<SourcePath> abiInputs,
      ImmutableSet<Either<SourcePath, Path>> additionalClasspathEntries,
      JavacOptions javacOptions,
      boolean trackClassUsage,
      CompileToJarStepFactory compileStepFactory,
      Optional<Path> resourcesRoot,
      Optional<String> mavenCoords,
      Optional<SourcePath> manifestFile,
      ImmutableSortedSet<BuildTarget> tests) {
    super(
        params,
        resolver,
        ruleFinder,
        srcs,
        resources,
        javacOptions.getGeneratedSourceFolderName(),
        proguardConfig,
        postprocessClassesCommands,
        exportedDeps,
        providedDeps,
        abiInputs,
        trackClassUsage,
        additionalClasspathEntries,
        compileStepFactory,
        resourcesRoot,
        Optional.empty(),
        mavenCoords,
        tests,
        javacOptions.getClassesToRemoveFromJar());
    this.manifestFile = manifestFile;
  }

  @Override
  public BuildableProperties getProperties() {
    return PROPERTIES;
  }

  public Optional<SourcePath> getManifestFile() {
    return manifestFile;
  }

  public static class Builder extends DefaultJavaLibraryBuilder {
    protected Builder(
        BuildRuleParams params,
        BuildRuleResolver buildRuleResolver,
        CompileToJarStepFactory compileStepFactory) {
      super(params, buildRuleResolver, compileStepFactory);
    }

    @Override
    protected AndroidLibrary newInstance(
        BuildRuleParams params,
        JavacOptions javacOptions,
        SourcePathResolver resolver,
        SourcePathRuleFinder ruleFinder,
        Set<? extends SourcePath> srcs,
        Set<? extends SourcePath> resources,
        Optional<Path> generatedSourceFolder,
        Optional<SourcePath> proguardConfig,
        ImmutableList<String> postprocessClassesCommands,
        ImmutableSortedSet<BuildRule> exportedDeps,
        ImmutableSortedSet<BuildRule> providedDeps,
        ImmutableSortedSet<SourcePath> abiInputs,
        boolean trackClassUsage,
        ImmutableSet<Either<SourcePath, Path>> additionalClasspathEntries,
        CompileToJarStepFactory compileStepFactory,
        Optional<Path> resourcesRoot,
        Optional<SourcePath> manifestFile,
        Optional<String> mavenCoords,
        ImmutableSortedSet<BuildTarget> tests,
        ImmutableSet<Pattern> classesToRemoveFromJar) {
      return new AndroidLibrary(
          params,
          resolver,
          ruleFinder,
          srcs,
          resources,
          proguardConfig,
          postprocessClassesCommands,
          exportedDeps,
          providedDeps,
          abiInputs,
          additionalClasspathEntries,
          javacOptions,
          trackClassUsage,
          compileStepFactory,
          resourcesRoot,
          mavenCoords,
          manifestFile,
          tests);
    }
  }
}
