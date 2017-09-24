/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.swing.combobox.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The class {@link AbstractComboBoxModel} contains the data for a combo list and the current
 * selected item.
 *
 * @param <T>
 *            the generic type of the Model
 */
@Getter
@NoArgsConstructor
public abstract class AbstractComboBoxModel<T> extends AbstractListModel<T>
	implements
		ComboBoxModel<T>
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * The generic combo list.
	 */
	@Setter
	private List<T> comboList;

	/**
	 * The the current selected item.
	 */
	private T selectedItem;

	/**
	 * Instantiates a new {@link AbstractComboBoxModel} from the given arguments.
	 *
	 * @param comboList
	 *            the combo list
	 * @param selectedItem
	 *            the selected item
	 */
	public AbstractComboBoxModel(List<T> comboList, T selectedItem)
	{
		this.comboList = comboList;
		this.selectedItem = selectedItem;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T getElementAt(int index)
	{
		return comboList.get(index);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getSize()
	{
		return comboList.size();
	}

	public void setComboSet(Set<T> set)
	{
		setComboList(new ArrayList<>(set));
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void setSelectedItem(Object anItem)
	{
		selectedItem = (T)anItem;
	}

}
