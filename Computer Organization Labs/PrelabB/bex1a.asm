a: DD 1024
b: DD 2048
c: DD 4096
d: DD 8192
e: DD 1

ld x5, a(x0)
ld x6, b(x0)
ld x7, c(x0)
ld x28, d(x0)

add x9, x5, x6
add x10, x9, x7
add x11, x10, x28

srli x12, x11, 2

sd x12, e(x0)