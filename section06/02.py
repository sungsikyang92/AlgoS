# 이진트리 순회(깊이우선탐색)

# 전위 순회(Preorder) root node -> left node -> right node
def DFS(v):
    if v > 7:
        return
    else:
        print(v, end=' ')
        DFS(v * 2) #왼쪽 자식
        DFS(v * 2 + 1) #오른쪽 자식


if __name__ == "__main__":
    DFS(1)
print()
# 중위 순회(Inorder) left node -> root node -> right node
def DFS(v):
    if v > 7:
        return
    else:
        DFS(v * 2)  # 왼쪽 자식
        print(v, end=' ')
        DFS(v * 2 + 1)  # 오른쪽 자식


if __name__ == "__main__":
    DFS(1)
print()
# 후위 순회(Postorder) left node -> right node -> root node
def DFS(v):
    if v > 7:
        return
    else:
        DFS(v * 2)  # 왼쪽 자식
        DFS(v * 2 + 1)  # 오른쪽 자식
        print(v, end=' ')


if __name__ == "__main__":
    DFS(1)
