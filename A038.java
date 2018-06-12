package day6_12;

import java.util.Map;
import java.util.TreeMap;
class Nod {
 int data;
 Nod left, right;

 Nod(int item) {
  data = item;
  left = right = null;
 }
}
public class A038 {
 Nod root;
 public void print(Nod node, int dist, Map<Integer, Integer> map) {
  if (node == null)
   return;
  if (!map.containsKey(dist)){
   map.put(dist, node.data);
  }else {
   int sum = map.get(dist) + node.data;
   map.put(dist, sum);
  }

  print(node.left, dist - 1, map);
  print(node.right, dist, map);
 }

 public static void main(String[] args) {
  A038 tree = new A038();
  Map<Integer, Integer> map = new TreeMap<>();// TreeMap保证添加进去的顺序
  // Let us create trees shown in above diagram
  tree.root = new Nod(1);
  tree.root.left = new Nod(2);
  tree.root.right = new Nod(3);
  tree.root.left.left = new Nod(4);
  tree.root.right.left = new Nod(5);
  tree.root.right.right = new Nod(6);
  tree.root.right.left.left = new Nod(7);
  tree.root.right.left.right = new Nod(8);
  tree.print(tree.root, 0, map);
  for (Integer value : map.values()) {
   System.out.print(  value+ " ");
  } 
 }
}