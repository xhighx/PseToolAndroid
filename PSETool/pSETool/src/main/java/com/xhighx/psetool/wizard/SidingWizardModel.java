package com.xhighx.psetool.wizard;

import android.content.Context;
import model.AbstractWizardModel;
import model.BranchPage;
import model.PageList;

public class SidingWizardModel extends AbstractWizardModel {

	public SidingWizardModel(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PageList onNewRootPageList() {
		return new PageList(
                new BranchPage(this, "Type")
                .addBranch("Vinyl Siding")
                .addBranch("Fiber Cement Siding")
        );
	}

}
