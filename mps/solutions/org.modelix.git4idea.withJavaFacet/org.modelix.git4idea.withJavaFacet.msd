<?xml version="1.0" encoding="UTF-8"?>
<solution name="org.modelix.git4idea.withJavaFacet" uuid="2d5cd737-852a-4885-95f3-b6f65b8b740d" moduleVersion="0" pluginKind="PLUGIN_OTHER" compileInMPS="true">
  <models>
    <modelRoot contentPath="${module}" type="default">
      <sourceRoot location="models" />
    </modelRoot>
    <modelRoot contentPath="${mps_home}/plugins/git4idea/lib" type="java_classes">
      <sourceRoot location="git4idea-rt.jar" />
      <sourceRoot location="git4idea.jar" />
    </modelRoot>
  </models>
  <facets>
    <facet type="java" languageLevel="JAVA_8">
      <classes generated="true" path="${module}/classes_gen" />
    </facet>
    <facet pluginId="Git4Idea" type="ideaPlugin" />
  </facets>
  <stubModelEntries>
    <stubModelEntry path="${mps_home}/plugins/git4idea/lib/git4idea-rt.jar" />
    <stubModelEntry path="${mps_home}/plugins/git4idea/lib/git4idea.jar" />
  </stubModelEntries>
  <sourcePath />
  <languageVersions>
    <language slang="l:f3061a53-9226-4cc5-a443-f952ceaf5816:jetbrains.mps.baseLanguage" version="11" />
    <language slang="l:f2801650-65d5-424e-bb1b-463a8781b786:jetbrains.mps.baseLanguage.javadoc" version="2" />
    <language slang="l:ceab5195-25ea-4f22-9b92-103b95ca8c0c:jetbrains.mps.lang.core" version="2" />
    <language slang="l:9ded098b-ad6a-4657-bfd9-48636cfe8bc3:jetbrains.mps.lang.traceable" version="0" />
  </languageVersions>
  <dependencyVersions>
    <module reference="2d5cd737-852a-4885-95f3-b6f65b8b740d(org.modelix.git4idea.withJavaFacet)" version="0" />
  </dependencyVersions>
</solution>
