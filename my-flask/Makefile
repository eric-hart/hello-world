#### PROJECT SETTINGS ####
# The name of the executable to be created
MAIN_NAME := main
# The name of flask web application used.
FLASK ?= flask
# Python command used.
PYTHON ?= python3.7
# Path to the source directory, relative to the makefile.
SRC_PATH = src
# Path to the test directory, relative to the makefile.
TEST_PATH = test
# Flag of start flask application.
RUN_FLAG = -m

# Generally should not need to edit below this line
# Clear built-in rules
.SUFFIXES:
# Extension of python files used in the project.
PY_EXT = py
# Extension of spec files used in the project.
SPEC_EXT = spec

# Verbose option, to output compile and link commands
export FLASK_APP=$(SRC_PATH)/$(MAIN_NAME).$(PY_EXT)

# Run flask web application main entry file.
.PHONY: run
run:
	$(PYTHON) $(RUN_FLAG) $(FLASK) run

# Test flask web application unit test.
.PHONY: test
test:
	$(PYTHON) $(TEST_PATH)/*.$(SPEC_EXT).$(PY_EXT)
