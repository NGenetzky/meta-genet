SUMMARY = "Standalone Cpp Application created with Makefile"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=70747ebb4dacfde55176608d54b6c353"

PV = "1.0.0"
PR = "r0"

BBCLASSEXTEND = "native nativesdk"

SRCREV = "9ef011f1f2656241c75444fe600b33c804d6740f"
S = "${WORKDIR}/${PN}"
SRC_URI = "\
	git://github.com/NGenetzky/genet-app.git;subpath=cpp/makefile-standalone-app;destsuffix=${PN} \
	https://raw.githubusercontent.com/NGenetzky/genet-app/${SRCREV}/LICENSE;subdir=${PN} \
"
SRC_URI[md5sum] = "70747ebb4dacfde55176608d54b6c353"
SRC_URI[sha256sum] = "619b73c782b8d423a938b84df572ac5c1c37d20175dd3041464c4ee08b1408a6"

do_install() {
    install -d \
        "${D}${bindir}"
    install --target-directory "${D}${bindir}" \
        "${B}/makefile-standalone-app"
}

