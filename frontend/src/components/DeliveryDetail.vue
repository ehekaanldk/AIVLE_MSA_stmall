<template>
    <div>
        <Number
            label="Orderid"
            v-model="value.orderid"
            :editMode="editMode"
        />
        <String
            label="Customerid"
            v-model="value.customerid"
            :editMode="editMode"
        />
        <String
            label="Itemid"
            v-model="value.itemid"
            :editMode="editMode"
        />
        <Number
            label="Qty"
            v-model="value.qty"
            :editMode="editMode"
        />
        <String
            label="Address"
            v-model="value.address"
            :editMode="editMode"
        />
        <String
            label="Status"
            v-model="value.status"
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
    name: 'DeliveryDetail',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "deliveryDetails",
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
