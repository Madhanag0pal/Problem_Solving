import sys
word,value = {},{}
for line in sys.stdin:
    line = line.split()
    if (line[0] == "def"):
        x,y = line[1],line[2]
        if x in word:
            del value[int(word[x])]
        word[x] = y
        value[int(y)] = x
    elif line[0] == "calc":
        ans = "unknown"
        if not len(list(filter(lambda x: x not in word,line[1::2]))):
          tot = eval(" ".join([word[i] if i in word else i for i in line[1:-1]]))
          ans = value[tot] if tot in value else ans
        print(*line,ans)
    else:
        word.clear()
        value.clear()
