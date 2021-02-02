C = gets.to_f
if 0 < C and C <= 100 then
    L = gets.to_i
    if 0 < L and L <= 100 then
        a = 0
        for i in 1..L
            w,l = gets.split.map(&:to_f)
            a += w*l
        end
        print "%0.7f"%[a*C]
    end
end
