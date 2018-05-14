C_SOURCE := foo_test

$(C_SOURCE): $(C_SOURCE).o
	$(CC) $(LDFLAGS) $(CFLAGS) \
		-lfoo -o $@ $<
clean:
	@rm -f $(C_SOURCE) $(C_SOURCE).o
