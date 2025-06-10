<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Order관리' }" />
        <VerticalNavLink
            :item="{
                title: 'OrderDetail',
                to: '/orderDetails',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Delivery관리' }" />
        <VerticalNavLink
            :item="{
                title: 'DeliveryDetail',
                to: '/deliveryDetails',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Stock관리' }" />
        <VerticalNavLink
            :item="{
                title: 'StockDetail',
                to: '/stockDetails',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Dashboard' }" />
        <VerticalNavLink
            :item="{
                title: 'Mypage',
                to: '/mypages',
            }"
        />
    </ul>
</template>
