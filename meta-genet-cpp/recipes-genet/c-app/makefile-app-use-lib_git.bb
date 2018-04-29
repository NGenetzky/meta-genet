SUMMARY = "Application that uses Shared Object"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=70747ebb4dacfde55176608d54b6c353"

PV = "0.1"
PR = "r0"

BBCLASSEXTEND = "native nativesdk"

DEPENDS = "\
	makefile-simplest-shared-lib \
"

SRCREV = "2ae3a60005be0f497df8513797c06d225b80294d"
S = "${WORKDIR}/${PN}"
SRC_URI = "\
	git://github.com/NGenetzky/genet-app.git;subpath=c/makefile-simplest-shared-lib;destsuffix=${PN} \
	https://raw.githubusercontent.com/NGenetzky/genet-app/${SRCREV}/LICENSE;subdir=${PN} \
    file://Makefile;subdir=${PN} \
"
SRC_URI[md5sum] = "70747ebb4dacfde55176608d54b6c353"
SRC_URI[sha256sum] = "619b73c782b8d423a938b84df572ac5c1c37d20175dd3041464c4ee08b1408a6"

do_install() {
	install -d \
		"${D}${bindir}"
	install --target-directory "${D}${bindir}" \
		"${B}/foo_test"
}

RDEPENDS_${PN} = "\
	makefile-simplest-shared-lib \
"

