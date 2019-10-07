#### PROJECT SETTINGS ####
# The name of the executable to be created
MAIN_NAME := main
# The name of R langage used.
R ?= Rscript
# The name of python.
PYTHON ?= python3.7
# The remove used.
RM ?= rm
# The copy used.
CP ?= cp
# The name of make directory used.
MKDIR ?= mkdir
# Path to the source directory, relative to the makefile.
SRC_PATH = src
# Path to the script directory, relative to the makefile.
SCRIPT_PATH = script
# Path to the build directory, relative to the makefile.
DIST_PATH = dist

# Generally should not need to edit below this line
# Clear built-in rules
.SUFFIXES:
# Extension of python files used in the project.
R_EXT = R

# Run R script main entry file.
.PHONY: dirs
dirs:
	$(MKDIR) $(DIST_PATH)

# Run R script main entry file.
.PHONY: run
run: clean dirs
	$(CP) $(SCRIPT_PATH)/show.py $(DIST_PATH)
	$(R) $(SRC_PATH)/$(MAIN_NAME).$(R_EXT)
	$(PYTHON) $(DIST_PATH)/show.py

# Run flask web application main entry file.
.PHONY: clean
clean:
	$(RM) -rf $(DIST_PATH)
