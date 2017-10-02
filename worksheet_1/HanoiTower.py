def moveT(N, fromp, top, helpp):
    if N >= 1:
        moveT(N - 1, fromp, helpp, top)
        help(fromp, top)
        moveT(N - 1, helpp, top, fromp)

def help(fp, tp):
    print("moving disk from",fp,"to",tp)

moveT(3, "A", "B", "C")
