A [Giter8][g8] template for full cross project against jvm, js and native platform!

```shell
g8 i10416/fullcross.g8
```

Release

```sh
 gpg --gen-key
```

```sh
export LONG_ID=
```

```sh
gpg --keyserver keyserver.ubuntu.com --send-keys $LONG_ID
```

```sh
gpg --armor --export-secret-keys $LONG_ID | base64 -w0
```

```sh
git tag -a v0.0.1 -m "v0.0.1"
```


Template license
----------------
Written in 2022 by Yoichiro Ito contact.110416+fullcross@gmail.com
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
