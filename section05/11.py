# 최대힙
import heapq
heap = []
while True:
    n = int(input())
    if n == -1:
        break
    if n == 0:
        if len(heap) == 0:
            print(-1)
        else:
            print(-1 * heapq.heappop(heap))
    else:
        heapq.heappush(heap, -n)
#
# class MaxHeap:
#     def __init__(self):
#         self.data = [None]
#
#     def insert(self, item):
#         self.data.append(item)
#
#         index = len(self.data) - 1
#
#         while index > 1:
#             numOfParentNode = index // 2
#             print(numOfParentNode)
#
#             if self.data[numOfParentNode] < self.data[index]:
#                 self.data[numOfParentNode], self.data[index] = self.data[index], self.data[numOfParentNode]
#                 index = numOfParentNode
#             else:
#                 break
#
#     def remove(self):
#         if len(self.data) > 1:
#             self.data[1], self.data[-1] = self.data[-1], self.data[1]
#             data = self.data.pop(-1)
#             self.maxHeapify(1)
#         else:
#             data = -1
#         return data
#
#     def maxHeapify(self, i):
#         left = i * 2
#         right = i * 2 + 1
#         smallest = i
#         # 자신(i), 왼쪽자식(left), 오른쪽자식(right)중 최대를 찾음
#         # 이것으 인덱스를 smallest에 담음
#         if left < len(self.data) and self.data[left] > self.data[smallest]:
#             smallest = left
#         if right < len(self.data) and self.data[right] > self.data[smallest]:
#             smallest = right
#         if smallest != i:
#             self.data[smallest], self.data[i] = self.data[i], self.data[smallest]
#             self.maxHeapify(smallest)
#             # 현재노드(i)와 최댓값 노드(smallest)의 값 바꾸기
#             # 재귀적으로 maxHeapify를 호출
#
#     def heapsort(unsorted):
#         H = MaxHeap()
#         for item in unsorted:
#             H.insert(item)
#         sorted = []
#         d = H.remove()
#         while d:
#             sorted.append(d)
#             d = H.remove()
#         return sorted
#
# while True:
#     mh = MaxHeap()
#     n = int(input())
#     if n == -1:
#         break
#     if n == 0:
#         print(mh.remove())
#     else:
#         mh.insert(n)
#         mh.maxHeapify(1)
