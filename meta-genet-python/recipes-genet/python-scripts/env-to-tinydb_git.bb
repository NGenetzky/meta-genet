SUMMARY = "Dumps environment variables to a JSON file using TinyDB"
DESCRIPTION = "A script that dumps environment variables to a JSON file using TinyDB."
HOMEPAGE = "https://github.com/NGenetzky/meta-genet"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "1.0.0"

GENET_SRCREV = "50fbf9d64d68b9d0a5f9b77df39c18e2569a24ea"
SRC_URI = "\
    https://gist.githubusercontent.com/NGenetzky/7aa478b3592e37ddcc753994fc013ab5/raw/${GENET_SRCREV}/env_to_tinydb.py;downloadfilename=env_to_tinydb-${PV}.py \
"
SRC_URI[sha256sum] = "f347da38828dd87d9c04d0cc3cd1fa33eec11c8b27fb4ff6b69bcd53cbb1f837"

RDEPENDS:${PN} = "\
    python3-tinydb \
"

BBCLASSEXTEND = "native nativesdk"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/env_to_tinydb-${PV}.py" "${D}${bindir}/env_to_tinydb.py"
}
