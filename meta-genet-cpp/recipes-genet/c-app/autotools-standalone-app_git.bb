SUMMARY = "Standalone C Application created with Autotools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=121076f22426f071132beb530878a672"

PV = "1.0"
PR = "r1"

SRCREV = "1139e56e70acac646dbecdbe36c46586e79aceb3"
SRC_URI = "\
	git://github.com/FrankBau/hello-cross-compilation.git;destsuffix=${PN}-${PV} \
"

inherit autotools pkgconfig
