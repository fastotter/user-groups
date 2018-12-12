# user-groups

A Clojure library designed to make it easy to see what groups a user belongs to.

The 'id' command is useful for seeing info about a user, e.g., what groups the user is in. Unfortunately you can't pipe the results to grep for to search for a group because 'id' dumps all groups on the same line. It's doable, but it's not obvious what groups you get a hit on because it shows you the whole line (all the groups) if there is a match.

## Usage
```
$ lein run <user-name>
```
Example:
```
$ lein run jdoe | grep Group
103892941(VIASAT\SEPG Change Group)
497777014(VIASAT\Accellion SFTP User Group)
1575186530(VIASAT\VSS Global Group)
1337434568(VIASAT\JTRS Change Group)
```

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
