a: DD 0xAAAABBBBCCCCDDDD
b: DD 0x4444333322221111

c: DM 8

ld x6, a(x0)
ld x7, b(x0)

add x5, x6, x7
sd x5, 16(x0)
sub x28, x6, x7
sd x28, 24(x0)
sub x29, x7, x6
sd x29, 32(x0)
and x30, x6, x7
sd x30, 40(x0)
or x31, x6, x7
sd x31, 48(x0)
xor x5, x6, x7
sd x5, 56(x0)
xori x29, x6, -1
addi x29, x29, 1
sd x29, 64(x0)
xori x30, x7, -1
addi x30, x30, 1
sd x30, 72(x0)



