SUMMARY = "Dumps environment varaibles to a JSON file using TinyDB"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PV = "1.0.0"
PR = "r0"

SRCREV = "50fbf9d64d68b9d0a5f9b77df39c18e2569a24ea"
SRC_URI = "\
    https://gist.githubusercontent.com/NGenetzky/7aa478b3592e37ddcc753994fc013ab5/raw/${SRCREV}/env_to_tinydb.py \
"
SRC_URI[md5sum] = "d37205f8b40b288f91a5515d0b8c2654"
SRC_URI[sha256sum] = "f347da38828dd87d9c04d0cc3cd1fa33eec11c8b27fb4ff6b69bcd53cbb1f837"

do_install() {
    install -d "${D}${bindir}"
    install --target-directory "${D}${bindir}" \
        "${WORKDIR}/env_to_tinydb.py"
}

