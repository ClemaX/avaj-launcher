#!/usr/bin/env bash

set -euo pipefail

OBJDIR=obj

java --class-path "$OBJDIR" avajlauncher.Simulation "$@"
