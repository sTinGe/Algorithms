package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc_133 {
    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    };

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        return clone(node, map);

    }

    public UndirectedGraphNode clone(UndirectedGraphNode node, Map<Integer, UndirectedGraphNode> map) {
        if (node == null) return null;

        if (map.containsKey(node.label)) {
            return map.get(node.label);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(clone.label, clone);
        for (UndirectedGraphNode neighbor: node.neighbors) {
            clone.neighbors.add(clone(neighbor, map));
        }
        return clone;
    }

}
