package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.HollowObjectSchema;
import com.netflix.hollow.read.customapi.HollowTypeAPI;
import com.netflix.hollow.objects.delegate.HollowCachedDelegate;

@SuppressWarnings("all")
public class DisallowedSubtitleLangCodeDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, DisallowedSubtitleLangCodeDelegate {

    private final int valueOrdinal;
   private DisallowedSubtitleLangCodeTypeAPI typeAPI;

    public DisallowedSubtitleLangCodeDelegateCachedImpl(DisallowedSubtitleLangCodeTypeAPI typeAPI, int ordinal) {
        this.valueOrdinal = typeAPI.getValueOrdinal(ordinal);
        this.typeAPI = typeAPI;
    }

    public int getValueOrdinal(int ordinal) {
        return valueOrdinal;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public DisallowedSubtitleLangCodeTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (DisallowedSubtitleLangCodeTypeAPI) typeAPI;
    }

}