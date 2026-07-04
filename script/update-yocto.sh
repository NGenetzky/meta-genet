#!/bin/sh
# script/update-yocto: Move the poky and meta-openembedded submodules to the
# tip of a given Yocto release branch (e.g. "scarthgap", "kirkstone",
# "wrynose"). Defaults to "scarthgap" if no release is given.
set -e

cd "$(dirname "$0")/.."

release="${1:-scarthgap}"

for layer in layers/poky layers/meta-openembedded; do
    echo "==> Updating ${layer} to ${release}"
    git -C "${layer}" fetch origin "${release}"
    git -C "${layer}" checkout "origin/${release}"
done
