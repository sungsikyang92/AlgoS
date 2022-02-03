# 스도쿠 검사
# 1부터 9까지 행, 열, 3by3 box 다 있는지 검사 하면 됨!
sudoku = [list(map(int, input().split())) for _ in range(9)]
# print(sudoku)

def row_chk(sudoku):
    for i in range(9):
        row_chk = [0] * 10
        for j in range(9):
            row_chk[sudoku[i][j]] = 1
        if sum(row_chk) == 9:
            continue
        else:
            return False
    return True

def col_chk(sudoku):
    for i in range(9):
        col_chk = [0] * 10
        for j in range(9):
            col_chk[sudoku[j][i]] = 1
        if sum(col_chk) == 9:
            continue
        else:
            return False
    return True

def box_chk(sudoku):
    for k in range(3):
        for l in range(3):
            box_chk = [0] * 10
            for m in range(3):
                for n in range(3):
                    box_chk[sudoku[(k * 3) + m][(l * 3) + n]] = 1
            if sum(box_chk) == 9:
                continue
            else:
                return False
    return True

if row_chk(sudoku) and col_chk(sudoku) and box_chk(sudoku):
    print("YES")
else:
    print("NO")