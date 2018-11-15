package Iterate;

/**
 * BookShelf
 *
 * @author zhiguo.zheng
 * @date 2018/11/15
 * @time 22:45
 * @description 表示书架的类
 */

public class BookShelf implements Aggregate{

    /**
     * 书的集合
     */
    private Book[] books;

    /**
     * 指向集合末尾的下表
     */
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     * 或者指定位置的书
     * @param index 集合的指定下标位置
     * @return 指定位置的书
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * 向集合末尾添加书籍
     * @param book 所要添加的书籍
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * 得到书籍集合的数量
     * @return 数量值
     */
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
