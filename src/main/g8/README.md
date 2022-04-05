## $name$
[![Release]($githubRepo$/actions/workflows/release.yaml/badge.svg)]($githubRepo$/actions/workflows/release.yaml)

$description$

| scala version | pre-release                                                                                                                                                                                                        | release                                                                                                                               |
| ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------- |
| 2.12          | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$_2.12.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$_2.12/) | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$_2.12.svg)](https://search.maven.org/artifact/$org$/$name$_2.12) |
| 2.13          | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$_2.13.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$_2.13/) | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$_2.13.svg)](https://search.maven.org/artifact/$org$/$name$_2.13) |
| 3.0           | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$_3.0.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$_3.0/)   | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$_3.0.svg)](https://search.maven.org/artifact/$org$/$name$_3.0)   |
| 3.1           | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$_3.1.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$_3.1/)   | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$_3.1.svg)](https://search.maven.org/artifact/$org$/$name$_3.1)   |


## Install

sbt
```scala
ThisBuild / scalafixDependencies  += "$org$" %% "$name$" % "0.0.1"
```

Mill
```scala
def scalafixIvyDeps = Agg(ivy"$org$::$name$:0.0.1")
```

## How to Use
| rule | description |
| ---- | ----------- |
| ???  | ???         |


## How to contribute?

- Give it a star⭐
- Drop the feedback to the author @$githubId$
- Send a PR with fixes of typos/bugs/etc🐛

## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
