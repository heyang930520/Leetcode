#!/usr/bin/python
a = [0,0,1,2,3]
for i in a:
    if i == 0:
        a.remove(0)
        a.append(0)
print a
