/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package repack.apache.commons.collections4.iterators;

import java.util.Objects;

import repack.apache.commons.collections4.OrderedMapIterator;

/**
 * Provides basic behavior for decorating an ordered map iterator with extra functionality.
 * <p>
 * All methods are forwarded to the decorated map iterator.
 *
 * @param <K> the type of keys
 * @param <V> the type of mapped values
 * @since 3.0
 */
public class AbstractOrderedMapIteratorDecorator<K, V> implements OrderedMapIterator<K, V> {

    /** The iterator being decorated */
    private final OrderedMapIterator<K, V> iterator;

    /**
     * Constructor that decorates the specified iterator.
     *
     * @param iterator  the iterator to decorate, must not be null
     * @throws NullPointerException if the iterator is null
     */
    public AbstractOrderedMapIteratorDecorator(final OrderedMapIterator<K, V> iterator) {
        this.iterator = Objects.requireNonNull(iterator, "iterator");
    }

    /**
     * Gets the iterator being decorated.
     *
     * @return the decorated iterator
     */
    protected OrderedMapIterator<K, V> getOrderedMapIterator() {
        return iterator;
    }


    /** {@inheritDoc} */
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    /** {@inheritDoc} */
    @Override
    public K next() {
        return iterator.next();
    }

    /** {@inheritDoc} */
    @Override
    public boolean hasPrevious() {
        return iterator.hasPrevious();
    }

    /** {@inheritDoc} */
    @Override
    public K previous() {
        return iterator.previous();
    }

    /** {@inheritDoc} */
    @Override
    public void remove() {
        iterator.remove();
    }

    /** {@inheritDoc} */
    @Override
    public K getKey() {
        return iterator.getKey();
    }

    /** {@inheritDoc} */
    @Override
    public V getValue() {
        return iterator.getValue();
    }

    /** {@inheritDoc} */
    @Override
    public V setValue(final V obj) {
        return iterator.setValue(obj);
    }

}
