#!/bin/sh
# script/bootstrap-bitbake: Install the OS packages required by bitbake/poky.
set -e

sudo apt-get update
sudo apt-get install -y diffstat gawk chrpath
