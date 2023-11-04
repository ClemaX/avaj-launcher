#!/usr/bin/env bash

set -euo pipefail

shopt -s globstar

SRC_TARGET=21
RELEASE_TARGET=21

SRCDIR=src
OBJDIR=obj

javac --target "$RELEASE_TARGET" --source "$SRC_TARGET" -d "$OBJDIR" "$SRCDIR/"**/*.java
