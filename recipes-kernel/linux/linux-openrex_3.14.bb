# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for OpenRex board"
DESCRIPTION = "Linux kernel based on Freescale 3.14.52-1.1.0 GA release, used by FSL Community BSP in order to \
provide support for i.MX6 based platforms and include official Linux kernel stable updates, backported \
features and fixes coming from the vendors, kernel community or FSL Community itself."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

#SRCREV is the branch number, update according to your last commit
SRCREV = "578482c6aab0bdecd0fa3fd360bc7fd4ea202808"

SRC_URI = "git://github.com/PeakNoise/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

#PV .= "+git${SRCPV}"
PV .=""

COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex|imx6s-openrex)"
