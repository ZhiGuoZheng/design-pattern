package Iterate;

/**
 * BookShelfIterator
 *
 * @author zhiguo.zheng
 * @date 2018/11/15
 * @time 22:50
 * @description 遍历书架的类
 */

public class BookShelfIterator implements Iterator {

    /**
     * 迭代器所要遍历的书架
     */
    private BookShelf bookShelf;

    /**
     * 迭代器当前所指向的下标
     */
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
