package com.bingo.server.game.landlord.entity.po.cardlist;

import com.bingo.server.game.landlord.entity.po.CardSort;
import com.bingo.server.game.landlord.error.CardListPatternException;
import com.bingo.server.game.landlord.error.CardTypeComparableException;
import com.bingo.server.game.landlord.util.CardTools;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class A3B3CD extends A3B3 {

	private List<Integer> addNumList = new ArrayList<>();

	public List<Integer> getAddNumList() {
		return addNumList;
	}

	public void setAddNumList(List<Integer> addNumList) {
		this.addNumList = addNumList;
	}
	@Override
	public int compareTo(CardList arg0) {
		if (arg0.getClass() == A4.class || arg0.getClass() == KQ.class)
			return -1;

		if (getClass() != arg0.getClass())
			throw new CardTypeComparableException();

		A3B3CD a3b3cd = (A3B3CD) arg0;
		if (getLength() != a3b3cd.getLength())
			throw new CardTypeComparableException();

		return getNum() - ((A3B3CD) arg0).getNum();
	}

	@Override
	public CardList pattern(CardSort cardSort, List<Integer> arr) throws CardListPatternException {
		if (((arr.size() >= 8) && (arr.size() - 8) % 4 != 0) )
			throw new CardListPatternException();

		Set<Integer> set2 = cardSort.getCardSort().get(2);
		if (set2.size() < 2)
			throw new CardListPatternException();
		cardSort = cardSort.clone();

		Set<Integer> set0 = cardSort.getCardSort().get(0);
		Set<Integer> set1 = cardSort.getCardSort().get(1);
		Set<Integer> set3 = cardSort.getCardSort().get(3);
		set2 = cardSort.getCardSort().get(2);

		int tmp = 0;
		int first = 0;
		int len = 0;
		for (int value : set2) {
			if (tmp == 0) {
				// 如果第三行数组中第一个数字是大于K则就没有可能了
				if (value > CardTools.C_K)
					throw new CardListPatternException();

				first = value;
				tmp = value;
			} else {
				if (value > CardTools.C_A)
					break;
			}
			len++;
		}
		if (len < 2)
			throw new CardListPatternException();

		for (int n = first; n < first+len; n++)
			CardTools.rmValue(cardSort, n, 3);


		if (set0.size() + set3.size() + set1.size() != len) {
			throw new CardListPatternException();
		}

		A3B3CD a = new A3B3CD();
		a.setNum(first);
		a.setLength(set2.size());
		a.getAddNumList().addAll(set0);
		a.getAddNumList().addAll(set1);

		return a;
	}

	@Override
	public void recommand(List<List<Integer>> recommandList, CardSort cardSort, CardList lastCardList,
			List<Integer> arr) {
		// TODO Auto-generated method stub
		//super.recommand(recommandList, cardSort, lastCardList, arr);
	}


}
