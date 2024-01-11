# Hash 란?
- 데이터의 key 값이 <b>Hash 함수</b>를 통해서 변환된 간단한 정수이며, 해시는 배열의 인덱스, 위치, 데이터 값을 저장하거나 검색할 때 활용됨.
- 저장 또는 검색 등에서 자주 활용되는 자료구조이다.


## Hash 함수
- 데이터의 key 값이 Hash 함수를 통해 변환되는 경우는 Object 클래스의 아래 코드를 타면서 변환된다.
- native 함수로 c언어로 작성되어있다.
```java
public class Object {
    public native int hashCode();
}
```

## HashMap.put() 하게 될 경우
```java
public class HashMap<K,V> {
    public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }

    final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
        Node<K,V>[] tab; 
        Node<K,V> p; 
        int n, i;
        
        if ((tab = table) == null || (n = tab.length) == 0) { n = (tab = resize()).length; }
        if ((p = tab[i = (n - 1) & hash]) == null) { tab[i] = newNode(hash, key, value, null); }
        else {
            Node<K,V> e; 
            K k;
            if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k)))) e = p;
            else if (p instanceof TreeNode) e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
}
```