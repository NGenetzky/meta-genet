#!/bin/sh
# script/bootstrap-oe: Install dependencies needed to lint OpenEmbedded/BitBake
# recipes. Does not require the poky/meta-openembedded submodules.
set -e

cd "$(dirname "$0")/.."

pip install oelint-adv
