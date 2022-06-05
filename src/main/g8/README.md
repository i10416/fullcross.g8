## $name$
[![Release]($githubRepo$/actions/workflows/release.yaml/badge.svg)]($githubRepo$/actions/workflows/release.yaml)

$description$

| scala version | pre-release                                                                                                                                                                                                        | release                                                                                                                               |
| ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------- |
| 2.12          | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$-core_2.12.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$-core_2.12/) | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$-core_2.12.svg)](https://search.maven.org/artifact/$org$/$name$-core_2.12) |
| 2.13          | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$-core_2.13.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$-core_2.13/) | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$-core_2.13.svg)](https://search.maven.org/artifact/$org$/$name$-core_2.13) |
| 3.1           | [![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/https/s01.oss.sonatype.org/$org$/$name$-core_3.1.svg)](https://s01.oss.sonatype.org/content/repositories/snapshots/$org;format="packaged"$/$name$-core_3.1/)   | [![Maven Central](https://img.shields.io/maven-central/v/$org$/$name$-core_3.1.svg)](https://search.maven.org/artifact/$org$/$name$-core_3.1)   |


## Install

sbt
```scala
libraryDependencies  += "$org$" %% "$name$-core" % "0.0.1"
```

Mill
```scala
def ivyDeps = Agg(ivy"$org$::$name$-core:0.0.1")
```

## How to Use


## How to contribute?

- Give it a star⭐
- Drop the feedback to the author @$githubId$
- Send a PR with fixes of typos/bugs/etc🐛

## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
