<template>
    <div>
        <String
            label="Name"
            v-model="value.name"
            :editMode="editMode"
        />
        <String
            label="Stock"
            v-model="value.stock"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'StockDetail',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "stockDetails",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
