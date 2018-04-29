SUMMARY = "Use a custom script for a bitbake task."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r0"

DEPENDS += "\
    env-to-tinydb-native \
"

addtask do_env_to_tinydb after do_populate_recipe_sysroot before do_install
do_env_to_tinydb[dirs] = "${WORKDIR}"
do_env_to_tinydb(){
    "${STAGING_DIR_NATIVE}/usr/bin/env_to_tinydb.py"
    cat "${WORKDIR}/db.json"
}
