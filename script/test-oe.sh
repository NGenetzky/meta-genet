#!/bin/sh
# script/test-oe.sh: Lint recipes with oelint-adv. Fast and cheap; does not
# require checking out the poky/meta-openembedded submodules.
#
# By default, lints every recipe/include file found anywhere in the repo.
# If given one or more file or directory arguments, only those paths are
# linted instead.
set -e

cd "$(dirname "$0")/.."

if [ "$#" -eq 0 ]; then
    set -- $(find . -name '.git' -prune -o \( -name '*.bb' -o -name '*.inc' \) -print)
fi

oelint-adv \
    --suppress oelint.var.suggestedvar.CVE_PRODUCT \
    --suppress oelint.var.suggestedvar.SECTION \
    --suppress oelint.var.licenseremotefile \
    "$@"
