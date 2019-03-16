# Build Instructions

**Note**: The information below is primarily intended for contributors to
development and maintenance of this repository.
It provides instructions for building components of this repository.
You do **not** need to follow these instructions if you want to access
or download the teaching materials as they are readily available on the
[Course Website].
You can also download all the teaching materials as a single [PDF file].

## Building with Docker

The most convenient way to build all teaching materials consistency and
independent of the platform you are running, is using Docker.

```bash
docker build -t ghorbanzade/umb-cs114-2015f -f cfg/Dockerfile .
docker create --name umb-cs114-2015f ghorbanzade/umb-cs114-2015f:latest
docker cp umb-cs114-2015f:/opt/bin ./bin
docker stop umb-cs114-2015f
docker rm umb-cs114-2015f
docker image prune --filter label=stage=intermediate
```

## Building Natively

Since teaching materials were developed in 2015, the development
environment is based on __Ubuntu 14.04 LTS__.
Dependencies for other distributions may vary.

The packages needed for building source code are as follows.

```bash
sudo apt-get install ant
sudo apt-get install make
sudo apt-get install zip
```

And the following is the list of packages required to build all documents.

```bash
sudo apt-get install ghostscript
sudo apt-get install latex-beamer
sudo apt-get install lmodern
sudo apt-get install make
sudo apt-get install openjdk-7-jdk
sudo apt-get install python-pygments
sudo apt-get install texlive-fonts-recommended
sudo apt-get install texlive-latex-base
sudo apt-get install texlive-latex-extra
sudo apt-get install texlive-xetex
sudo apt-get install zip
```

All source code and documents can be build by issuing `make` in the top-level
directory.
If you wish to build source code only, issue `make code`.
Similarly, if you intend to build only the documents, you can run `make docs`.

Please send [me](mailto:pejman@ghorbanzade.com) a note in case you found a
dependency not listed here.

[Course Website]: https://pejman.ghorbanzade.com/teaching/CS114-2015F
[PDF file]: https://github.com/ghorbanzade/UMB-CS114-2015F/releases/download/v1.1/umb-cs114-2015f.pdf