package pr3;


import java.util.*;
import java.util.concurrent.Semaphore;


public class ListSemaphore<E> implements List<E> {
    private final List<E> list = new ArrayList<>();
    private final Semaphore semaphore = new Semaphore(1, true);

    @Override
    public boolean add(E e) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.add(e);
            semaphore.release();
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean remove(Object o) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.addAll(index, c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            list.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E remove(int index) {
        E value = null;
        try {
            semaphore.acquire();
            value = list.remove(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public int indexOf(Object o) {
        int value = 0;
        try {
            semaphore.acquire();
            value = list.indexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public int lastIndexOf(Object o) {
        int value = 0;
        try {
            semaphore.acquire();
            value = list.lastIndexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> value = null;
        try {
            semaphore.acquire();
            value = list.listIterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> value = null;
        try {
            semaphore.acquire();
            value = list.listIterator(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> value = null;
        try {
            semaphore.acquire();
            value = list.subList(fromIndex, toIndex);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public int size() {
        int value = 0;
        try {
            semaphore.acquire();
            value = list.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public boolean contains(Object o) {
        boolean value = false;
        try {
            semaphore.acquire();
            value = list.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> value = null;
        try {
            semaphore.acquire();
            value = list.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public Object[] toArray() {
        Object[] value = new Object[]{};
        try {
            semaphore.acquire();
            value = list.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] value = new Object[]{};
        try {
            semaphore.acquire();
            value = list.toArray(a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (T[]) value;
    }

    @Override
    public E get(int index) {
        E value = null;
        try {
            semaphore.acquire();
            value = list.get(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public E set(int index, E ex) {
        E value = null;
        try {
            semaphore.acquire();
            value = list.set(index, ex);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    @Override
    public void add(int index, E element) {
        try {
            semaphore.acquire();
            list.add(index, element);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "SynList{" + list +
                '}';
    }
}
