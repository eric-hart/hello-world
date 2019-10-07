#### PROJECT SETTINGS ####
# The name of the executable to be created
BIN_NAME := main
# Compiler used
CC ?= gcc
# Copy used
CP ?= cp
# Move used
MV ?= mv
# Copy used
PYTHON ?= python3.7
# Extension of object files used in the project
OBJ_EXT = o
# Extension of source files used in the project
SRC_EXT = c
# Path to the source directory, relative to the makefile
SRC_PATH = src
# Path to the script directory, relative to the makefile
SCRIPT_PATH = script
# Path to the source directory, relative to the makefile
DIST_PATH = dist
# Space-separated pkg-config libraries used by this project
LIBS =
# General compiler flags
COMPILE_FLAGS = -std=c99 -Wall -Wextra -g
# Additional release-specific flags
RCOMPILE_FLAGS = -D NDEBUG
# Additional debug-specific flags
DCOMPILE_FLAGS = -D DEBUG
# Add additional include paths
INCLUDES = /usr/local/lib/*.dylib
# General linker settings
LINK_FLAGS =
# Additional release-specific linker settings
RLINK_FLAGS =
# Additional debug-specific linker settings
DLINK_FLAGS =
#### END PROJECT SETTINGS ####

# Main rule, checks the executable and symlinks to the output
.PHONY: all
all: dirs $(DIST_PATH)/$(BIN_NAME)

# Create the directories used in the build
.PHONY: dirs
dirs:
	@echo "Creating directories"
	@mkdir -p $(DIST_PATH)

# Removes all build files
.PHONY: clean
clean:
	@echo "Deleting directories"
	@$(RM) -r $(DIST_PATH)

# Run all executable files
.PHONY: run
run: all
	@echo "Run all executable files"
	$(DIST_PATH)/$(BIN_NAME)
	@echo "Copy script files"
	$(CP) $(SCRIPT_PATH)/show.py $(DIST_PATH)
	@echo "Show output images"
	$(PYTHON) $(DIST_PATH)/show.py


# Link the executable
$(DIST_PATH)/$(BIN_NAME): $(DIST_PATH)/*.$(OBJ_EXT)
	@echo "Linking: $@"
	@$(START_TIME)
	$(CMD_PREFIX)$(CC) $(INCLUDES) $^ $(LDFLAGS) -o $@
	@echo -en "\t Link time: "
	@$(END_TIME)

# Source file rules
# After the first compilation they will be joined with the rules from the
# dependency files to provide header dependencies
$(DIST_PATH)/%.$(OBJ_EXT): $(SRC_PATH)/%.$(SRC_EXT)
	@echo "Compiling: $< -> $@"
	@$(START_TIME)
	$(CMD_PREFIX)$(CC) $(CFLAGS) -c $(SRC_PATH)/*.$(SRC_EXT)
	$(MV) *.$(OBJ_EXT) $(DIST_PATH)
	@echo -en "\t Compile time: "
	@$(END_TIME)#### PROJECT SETTINGS ####
