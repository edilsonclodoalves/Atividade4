import matplotlib.pyplot as plt
import networkx as nx

class Node:
    def __init__(self, value):
        self.left = None
        self.right = None
        self.value = value

class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, value):
        if self.root is None:
            self.root = Node(value)
        else:
            self._insert_recursive(self.root, value)

    def _insert_recursive(self, current_node, value):
        if value < current_node.value:
            if current_node.left is None:
                current_node.left = Node(value)
            else:
                self._insert_recursive(current_node.left, value)
        elif value > current_node.value:
            if current_node.right is None:
                current_node.right = Node(value)
            else:
                self._insert_recursive(current_node.right, value)

    def plot(self, node=None, pos=None, x=0, y=0, layer=1):
        if pos is None:
            pos = {}
        if node is None:
            node = self.root
        pos[node.value] = (x, y)
        if node.left:
            pos = self.plot(node.left, pos, x - 1 / layer, y - 1, layer + 1)
        if node.right:
            pos = self.plot(node.right, pos, x + 1 / layer, y - 1, layer + 1)
        return pos

    def display_graph(self):
        pos = self.plot()
        graph = nx.DiGraph()
        nodes = pos.keys()
        for node in nodes:
            graph.add_node(node)
        self._add_edges(self.root, graph)

        fig, ax = plt.subplots(figsize=(8, 5))
        nx.draw(graph, pos, with_labels=True, arrows=False)
        plt.show()

    def _add_edges(self, node, graph):
        if node.left:
            graph.add_edge(node.value, node.left.value)
            self._add_edges(node.left, graph)
        if node.right:
            graph.add_edge(node.value, node.right.value)
            self._add_edges(node.right, graph)

# Cria a árvore binária e insere valores
tree = BinaryTree()
#values = [15,10,25,13,7,2,45,20,23,37] #10
#values = [15,10,25,13,7,2,45,20,23,37,6] #11
values = [15,25,13,7,2,45,23,37,6] #9
for value in values:
    tree.insert(value)

# Exibe a árvore binária de forma visual
tree.display_graph()
