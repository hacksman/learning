
链表的经典使用场景是LRU缓存淘汰算法。当缓存用满时，决定哪些被清出去。有三种常见的策略：FIFO（先进先出）、LFU（最少使用）、LRU（最近最少使用），如何使用链表实现LRU缓存淘汰策略？

### 五花八门的链表数据结构

数组需要一块连续的内存空间来存储，对内存的要求较高，链表则相反，它不需要连续的内存空间，它通过“指针“将一组零散的内存块串联起来使用。如下图所示

![][image-1]

#### 单链表、双向链表和循环链表
链表通过将一组零散的内存块串联在一起，其中，把内存块称作链表的“结点”，为了将所有的结点串联起来，每个链表除了存储数据之外，还需要记录下一个结点的地址。如图所示，我们将这个记录下一个结点的指针叫做 __后继指针next__

![][image-2]

可以看出，其中头结点和尾结点比较特殊，头结点用来记录链表的基地址。有了它我们便可以遍历得到整个链表。而尾结点不是指向下一个指针，而是指向一个空地址null

与数组一样，链表也支持数据的查找、插入和删除，数组因为需要保证数据的连续性，所以插入和删除数据时，要做大量的搬移工作，时间复杂度为O(n)，而在链表中则不用。因为链表本身的存储空间就不连续。链表的插入删除，我们只需要考虑相邻两个节点指针的变化，所以时间复杂度是O(1)

![][image-3]

链表随机访问的性能就远没有数组好，只能一个个遍历查找，你可以想象成一个队伍，你想找到第几个人，就得一个一个去数。需要O(n)的时间复杂度

__循环链表如图：__

![][image-4]

__双向链表：__

![][image-5]

它支持两个方向，每个节点不止有一个后继指针next，还有一个前驱指针prev指向前面的节点

因为每个节点多存储了一个prev前驱指针，所以，存储同样多的数据，双向链表比单链表占用更多的空间。从结构上看，双向链表支持时间复杂度为O(1)的情况下找到前驱结点，正是因为这个特性，它在给定一个指针的情况下，删除和插入前面的某个结点，时间复杂度就有差距，单链表是O(n)，双向链表则是O(1)

__双向循环链表：__

![][image-6]

### 链表 VS 数组性能大比拼


[image-1]:	https://github.com/hacksman/learning/blob/master/picture/neicunfenbu.jpg
[image-2]:	https://github.com/hacksman/learning/blob/master/picture/danlianbiao.jpg
[image-3]:	https://github.com/hacksman/learning/blob/master/picture/lianbiaocharushanchu.jpg
[image-4]:	https://github.com/hacksman/learning/blob/master/picture/xunhuanlianbiao.jpg
[image-5]:	https://github.com/hacksman/learning/blob/master/picture/shuangxianglianbiao.jpg
[image-6]:	https://github.com/hacksman/learning/blob/master/picture/shuangxiangxunhuan.jpg