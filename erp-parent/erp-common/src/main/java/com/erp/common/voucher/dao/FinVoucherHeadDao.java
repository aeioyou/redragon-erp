/*
 * Copyright 2020-2021 redragon.dongbin
 *
 * This file is part of redragon-erp/赤龙ERP.

 * redragon-erp/赤龙ERP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.

 * redragon-erp/赤龙ERP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with redragon-erp/赤龙ERP.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.erp.common.voucher.dao;

import com.framework.api.DaoCRUDIF;
import com.erp.common.voucher.dao.model.FinVoucherHead;
import com.erp.common.voucher.dao.model.FinVoucherHeadCO;

public interface FinVoucherHeadDao extends DaoCRUDIF<FinVoucherHead, FinVoucherHeadCO>{
    
    //删除凭证头（根据头编码）
    public abstract void deleteFinVoucherHeadByVoucherHeadCode(String voucherHeadCode);
    
}