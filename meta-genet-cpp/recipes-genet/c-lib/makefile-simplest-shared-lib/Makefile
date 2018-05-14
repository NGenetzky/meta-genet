CFLAGS += -fPIC -O3 -g -Wall -Werror
MAJOR := 0
MINOR := 1
NAME := foo
VERSION := $(MAJOR).$(MINOR)

lib: lib$(NAME).so.$(VERSION)

lib$(NAME).so: lib$(NAME).so.$(VERSION)
	ln -s lib$(NAME).so.$(MAJOR) lib$(NAME).so

lib$(NAME).so.$(VERSION): $(NAME).o
	$(CC) -shared -Wl,-soname,lib$(NAME).so.$(MAJOR) \
		$(CFLAGS) $(LDFLAGS) \
		$^ \
		-o $@

clean:
	$(RM) *.o *.so*
