from collections import deque


class Stack:
    def __init__(self):
        self.container = deque()

    def push(self, val):
        self.container.append(val)

    def pop(self):
        return self.container.pop()

    def peek(self):
        return self.container[-1]

    def is_empty(self):
        return len(self.container) == 0

    def size(self):
        return len(self.container)


stack = Stack()

print(stack.is_empty()) # True

stack.push(1)           # Stack = [1]
print(stack.is_empty()) # False

stack.push(2)           # Stack = [1, 2]
print(stack.size())     # 2

stack.push(3)           # Stack = [1, 2, 3]
stack.push(4)           # Stack = [1, 2, 3, 4]
print(stack.size())     # 4

print(stack.pop())      # 4 | Stack = [1, 2, 3]
print(stack.size())     # 3
