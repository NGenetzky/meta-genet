#!/bin/sh
# script/cibuild-bitbake: Parse (but do not build) all recipes visible to
# this layer using bitbake. This validates that the layer, its recipes, and
# its BBLAYERS wiring are all correct without doing any real build work.
set -e

cd "$(dirname "$0")/.."

. layers/poky/oe-init-build-env build

cat >> conf/bblayers.conf << 'EOF'
BBLAYERS += " \
  ${TOPDIR}/../meta-genet-python \
  ${TOPDIR}/../layers/meta-openembedded/meta-oe \
  ${TOPDIR}/../layers/meta-openembedded/meta-python \
  "
EOF

bitbake -p
